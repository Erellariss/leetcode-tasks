package practical.lb;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinLoadBalancer implements LoadBalancer {

    private final List<ServerInfo> servers = new CopyOnWriteArrayList<>();
    private final AtomicInteger counter = new AtomicInteger();

    public RoundRobinLoadBalancer(Collection<ServerInfo> servers) {
        this.servers.addAll(servers);
    }

    @Override
    public ServerInfo nextServer() {
        var snapshot = servers.toArray(new ServerInfo[]{});

        if (snapshot.length == 0) {
            throw new IllegalStateException();
        }

        return snapshot[counter.getAndUpdate(i -> i == Integer.MAX_VALUE ? 0 : i + 1) % snapshot.length];
    }

    @Override
    public void addServer(ServerInfo server) {
        servers.add(server);
    }

    @Override
    public void removeServer(ServerInfo server) {
        servers.remove(server);
    }
}

package practical.lb;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RoundRobinLoadBalancerTest {

    private final ServerInfo SERVER_ONE = new ServerInfo("asdasds", 1235);
    private final ServerInfo SERVER_TWO = new ServerInfo("asdasds2353y", 12425);
    private final ServerInfo SERVER_THREE = new ServerInfo("asdaasdsds", 53463);
    private final List<ServerInfo> serverList = List.of(
            SERVER_ONE,
            SERVER_TWO
    );

    @Test
    void emptyRoundRobin() {
        assertThrows(IllegalStateException.class, () -> new RoundRobinLoadBalancer(List.of()).nextServer());
    }

    @Test
    void roundRobinLb() {
        var lb = new RoundRobinLoadBalancer(serverList);

        assertEquals(SERVER_ONE, lb.nextServer());
        assertEquals(SERVER_TWO, lb.nextServer());
        assertEquals(SERVER_ONE, lb.nextServer());
    }

    @Test
    void roundRobinAddServer() {
        var lb = new RoundRobinLoadBalancer(serverList);

        lb.addServer(SERVER_THREE);

        assertEquals(SERVER_ONE, lb.nextServer());
        assertEquals(SERVER_TWO, lb.nextServer());
        assertEquals(SERVER_THREE, lb.nextServer());
        assertEquals(SERVER_ONE, lb.nextServer());
    }

    @Test
    void roundRobinRemoveServer() {
        var lb = new RoundRobinLoadBalancer(List.of(SERVER_ONE, SERVER_TWO, SERVER_THREE));

        lb.removeServer(SERVER_THREE);

        assertEquals(SERVER_ONE, lb.nextServer());
        assertEquals(SERVER_TWO, lb.nextServer());
        assertEquals(SERVER_ONE, lb.nextServer());
    }
}
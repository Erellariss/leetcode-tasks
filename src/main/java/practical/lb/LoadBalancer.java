package practical.lb;

public interface LoadBalancer {


    ServerInfo nextServer();

    void addServer(ServerInfo server);

    void removeServer(ServerInfo server);
}

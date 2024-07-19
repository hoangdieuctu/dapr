# Setup

## Run Dapr Placement Service
```shell
docker run -d --name dapr-placement -p 50005:50005 daprio/dapr-placement-server:1.9.0
```

## Run Dapr Sidecar
```shell
docker run -d --name dapr-sidecar -p 3500:3500 \
  -e DAPR_HTTP_PORT=3500 \
  -e DAPR_GRPC_PORT=50001 \
  -e DAPR_PLACEMENT_HOST_ADDRESS=dapr-placement:50005 \
  daprio/dapr:1.9.0 dapr run --app-id myapp --app-port 8080 --dapr-http-port 3500 --placement-host-address dapr-placement:50005

```

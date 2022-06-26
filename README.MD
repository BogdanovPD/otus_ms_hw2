How to run on minikube:

1. install and start minikube
2. minikube addons enable ingress
3. add to hosts: arch.homework {your_minikube_ip}
4. minikube tunnel
5. install helm
6. helm install hw2 ./k8s/otus-hw2-chart
7. kubectl apply -f ./k8s/initdb.yaml
8. use requests from postman collection to test API
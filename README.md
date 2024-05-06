# springboot-message-queue

스프링 부트와 메세지 큐를 함께 실습하며, 아래에 나열한 서비스들을 이용할 예정입니다. 각 서비스들에 대한 설명은 [노션 첨부 링크](https://www.notion.so/leedongyeop/7c7f0499e56b4347b14a736b676276ea#c10ab0e226e0447b85371312df22eccd)에서 확인하실 수 있습니다.
- [RabbitMQ](https://www.rabbitmq.com/)
- [Apache Kafka](https://kafka.apache.org/)
- [Apache Pulsar](https://pulsar.apache.org/)
- [Apache ActiveMQ](https://activemq.apache.org/)
- [Apache Camel](https://camel.apache.org/)
- [AWS SQS](https://aws.amazon.com/ko/sqs/)

<br/>

## Quick Start
### 공통
1. Git Clone
```bash
# ssh
$ git clone git@github.com:2dongyeop/springboot-message-queue.git

# https
$ git clone https://github.com/2dongyeop/springboot-message-queue.git
```

2. Open in IDE (IntelliJ ... )
3. Start Each Request/Response Server 

<br/>

### Kafka
1. 도커로 kafka 실행하기
```bash
# 프로젝트 루트에서 아래 명령어 실행
$ docker compose -f docker-compose-kafka.yml up

# 백그라운드에서 실행
$ docker compose -f docker-compose-kafka.yml up -d
```
2. Request 서버에서 요청보내고, Response Server에서 응답 확인하기

아래 경로에 있는 테스트 코드 실행시, 응답 서버 콘솔에서 결과 확인 가능
- `src/test/io/dongvelop/requestserver/kafka/KafkaProducerTest`
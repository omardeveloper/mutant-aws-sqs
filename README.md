# Java Spring with Cloud AWS with Beanstalk and ElastiCache using Redis

## API

Your can use the postman o the some tool by consult API Rest

The EndPoint Base Is: [http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com][baseUrl] 

We Have three endpoints with actions

| Method | URL | Parameters | Description |
| ------ | ------ |
| GET | [http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com/mutant/allDna][allDb] | NONE | Get all Records the DNA Corrects 
| GET | [http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com/mutant/stats][stats] | NONE | Have the statistics the DNA human and mutans
| POST | [http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com/mutant/meli][melli] | dna | You Must the sequence of DNA for know if is mutant

In the case of POST you should send a JSON with the next Structure:

```sh
{
    "dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
```

- EndPointS:  

## Architecture 
- [Java] - Java with Spring Framework
- [AWS] - Amazon Web Service, 
	- ElastiCache for Redis
	- Elastic Beanstalk
	- CodePipeline
	- IAM
- [Redis] - in-memory data structure store
- [GitHub] - Repository of Code Source

[meli]: <http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com/mutant/meli>
[baseUrl]: <http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com>
[hello]: <http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com/mutant/hello>
[allDb]: <http://spring-cloud-mutant-omar.us-east-1.elasticbeanstalk.com/mutant/allDna>

[Java]: <https://spring.io/>
[AWS]: <https://aws.amazon.com/es/?nc2=h_lg>
[Redis]: <https://redis.io/>
[GitHub]: <https://github.com/> 
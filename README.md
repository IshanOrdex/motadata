# motadata

#1.Project Title : AI-Assisted Knowledge Base Search

#2.Feature : Created project which is based on AI model. 
User can search on his/her query and based on that query AI model will return solution.
Currently , it is working only for some predifined data and search.

#3.Tech Stack

1).JDK 21
2).Spring boot version 3.5.3
3).Spring data JPA
4).MySQL
5).Maven

#4.Installation

1).please visit this git URL/repo.
2).Now click to copy this URL.
3).Use Git Clone wherever we need to set this project folder.
4).Open STS(Spring Tool Suit/any other tool) and import this project.


#5.Configuaration

1).edit app.properties as per your database connection
spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update


Now run spring boot project.

our project will run on port number : 8080

#6.API endpoint

1).http://localhost:8080/rest/search/content/ - POST API 

On request , we need to write our query or title so based on that title , AI model will return result/solution.

Currently , data that I inserted is given below

id	title				content
1, Reset Password, 		To reset your password, go to the login page and click "Forgot Password".
2, What is AI?, 		AI stands for Artificial Intelligence, where machines mimic human behavior.
3, Deep Learning, 		Deep learning is a subset of machine learning using neural networks.
4, VPN Troubleshooting, Make sure your VPN software is up to date and restart the application.

to check this API , we need to pass any word related to title or content , our AI model will return result or return none.
We can use postman to check this API.


#7.AI propmt link - 
I have used only one propmt and in that propmt I have asked more sub questions as per my analysis and used few solutions from it.

https://chatgpt.com/share/686eb7da-5a14-8004-87be-4c443a596886

Steps :

1).First I gave assignment words so I can get overall structure idea.

2).From the given solution I started to make file as per my understanding and knowledge.

3).I used code which was given by Chatgpt and then I asked few questions to make it dynamically but after getting result
I found that , its all related to data , I need to insert all this query related data in db and based on such keyword (at search time)
I need to fetch required solution for given problem .


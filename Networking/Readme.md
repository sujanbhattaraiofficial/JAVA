
# Network

1. A network is a collection of devices that share a common communication protocol and connected with some communication medium.

2. A protocol defines a set of rule to which all the communicating parties adhere to ( agree ).

3. The java.net package was designed with a group of classes and interfaces which not only provide low level but also high level communication details.

4. The java.net package provides support for the two common network protocols .

- TCP ( Transmission Control Protocol )
- UDP ( User Datagram Protocol )

> Differentiate between TCP and UDP .

|TCP|	UDP|
|-------|----------|
|Reliable|	Unreliable|
|Connection-oriented|	Connectionless|
|Segment re-transmission and flow control through windowing|	No windowing or re-transmission|
|Segment sequencing|	No sequencing|
|Acknowledge sequencing|	No acknowledgment|

# Network Programming
- The tern network programming refers to writing programs the execute accross multiple devices , in which the devices are all connected to each other using a network.

``` Some Terminologies ```

> Address :

- It is a logical address that can be change . IP address are a 32-bit number ( IPV4 format ) , often represented s a quad of four 8-bit number separated by periods.

               Eg : 192.168.0.1
        
> Protocol :

- It is set of rules basically that is followed for communication.

         Eg : TCP , UDP , FTP , POP . SMPT , HTTP . HTTPs

> Port Number :

- The port number is used to uniquely identify different applications . It acts as a communcation end point between applications .

- The Valid port number range from 1 - 65535 .

- The ports upto 1023 are reserved for well known services and hence are well-known ports .

         Eg : 80 fot HTTP , 21 for FTP , 22 for SSH
> Socket :

- A socket is an end point between two way communication.

- It defines a network connection as a Stream from which bytes can be read and similarly bytes can be sent.

- Java Socket can be used to provide both connection-oriented ( TCP ) as well as connectionless ( UDP ) services .

# Java Socket Programming
- A scoket programming is used for communcation between the application running on different machine.

- Java socket programming support :

|Connection-Oriented|	Connection-less|
|-----|-----|
|Classes Used:|	Classes Used :|
|```1. Socket```|```	1. Datagram Socket```|
|```2. ServerSocket```|```	2. DatagramPacket```|

- Client in socket programming must know :
1. IP Address of Server

2. Port Number

# Socket Class
- This class is used to create a socket .
> Methods

- ``` public InputStream getInputStream()```
- ```public OutputStream getOutputStream()```
- ```public Synchronized void close()```

# ServerSocket Class
- This class is used to create a server socket .
- This object is used to establish communication with the clients .
> Methods

- ```public Socket accept()```
- ```public synchronized void close()```
 #reference  #spark-setup
extract the tarball contents with `tar -xf spark-3.0.0-preview2-binhadoop2.7.tgz`
![[Screenshot 2025-05-04 at 11.10.18 AM.png]]


README.md 
- This file contains new detailed instructions on how to use Spark shells, build Spark from source, run standalone Spark examples, peruse links to Spark documentation and configuration guides, and contribute to Spark. 
bin 
- This directory, as the name suggests, contains most of the scripts you’ll employ to interact with Spark, including the Spark shells (spark-sql, pyspark, sparkshell, and sparkR). We will use these shells and executables in this directory later in this chapter to submit a standalone Spark application using sparksubmit, and write a script that builds and pushes Docker images when running Spark with Kubernetes support. 
sbin 
- Most of the scripts in this directory are administrative in purpose, for starting and stopping Spark components in the cluster in its various deployment modes. For details on the deployment modes, see the cheat sheet in Table 1-1 in Chapter 1. 
kubernetes 
- Since the release of Spark 2.4, this directory contains Dockerfiles for creating Docker images for your Spark distribution on a Kubernetes cluster. It also con‐ tains a file providing instructions on how to build the Spark distribution before building your Docker images.
data 
- This directory is populated with *.txt files that serve as input for Spark’s compo‐ nents: MLlib, Structured Streaming, and GraphX. 
examples 
- For any developer, two imperatives that ease the journey to learning any new platform are loads of “how-to” code examples and comprehensive documenta‐ tion. Spark provides examples for Java, Python, R, and Scala, and you’ll want to employ them when learning the framework. We will allude to some of these examples in this and subsequent chapters.
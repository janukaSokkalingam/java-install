   1.Download java
http://www.oracle.com/technetwork/java/javase/downloads/index.html
2.Open terminal type commant
cd Downloads

tar xzvf jdk-8u25-linux-x64.tar.gz

sudo mkdir /usr/lib/jvm

sudo mv ~/Downloads/jdk1.8.0_25/ /usr/lib/jvm/

sudo chown -R root:root /usr/lib/jvm/jdk1.8.0_25

sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk1.8.0_25/bin/java" 0

sudo update-alternatives --install "/usr/bin/javac" "javac" "/usr/lib/jvm/jdk1.8.0_25/bin/javac" 0

sudo update-alternatives --set java /usr/lib/jvm/jdk1.8.0_25/bin/java

sudo update-alternatives --set javac /usr/lib/jvm/jdk1.8.0_25/bin/javac

sudo gedit ~/.bashrc
	export JAVA_HOME=/usr/lib/jvm/jdk1.8.0_25
  	export PATH=$PATH:$JAVA_HOME/bin

. ~/.bashrc

java -version

echo $JAVA_HOME

echo $PATH


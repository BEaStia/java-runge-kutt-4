wget "http://downloads.sourceforge.net/project/mpjexpress/releases/mpj-v0_38.zip"
unzip "mpj-v0_38.zip" -d "/opt/"
rm "mpj-v0_38.zip"
cd /opt/
mv mpj-v0_38 mpj
export MPJ_HOME=/opt/mpj/
export PATH=$PATH:$MPJ_HOME/bin
echo "export MPJ_HOME=/opt/mpj/;export PATH=$PATH:$MPJ_HOME/bin" > ~/.bashrc


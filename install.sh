wget "http://downloads.sourceforge.net/project/mpjexpress/releases/mpj-v0_38.zip?r=http%3A%2F%2Fsourceforge.net%2Fprojects%2Fmpjexpress%2F&ts=1384439672&use_mirror=citylan"
unzip "mpj-v0_38.zip" -d "/opt/"
rm "mpj-v0_38.zip"
cd /opt/
mv mpj-v0_38 mpj
export MPJ_HOME=/opt/mpj/
export PATH=$PATH:$MPJ_HOME/bin
echo "export MPJ_HOME=/opt/mpj/" > ~/.bashrc
echo "export PATH=$PATH:$MPJ_HOME/bin" > ~/.bashrc


#!/bin/bash

test -L /home/vagrant/code || ln -s /vagrant/code /home/vagrant/code && chown -h vagrant:vagrant /home/vagrant/code

test -L /home/vagrant/.bash_vagrant || ln -s /vagrant/scripts/.bash_vagrant /home/vagrant/.bash_vagrant && chown -h vagrant:vagrant /home/vagrant/.bash_vagrant

test 0 -eq $(cat /home/vagrant/.bashrc | grep bash_vagrant | wc -l) && echo ". ~/.bash_vagrant" >> /home/vagrant/.bashrc

apt-get update

apt-get install -y default-jre
apt-get install -y default-jdk


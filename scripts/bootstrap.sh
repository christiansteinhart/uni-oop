#!/bin/bash

test -L /home/vagrant/code || ln -s /vagrant/code /home/vagrant/code && chown -h vagrant:vagrant /home/vagrant/code

test -L /home/vagrant/.bashrc || ln -s /vagrant/scripts/.bashrc /home/vagrant/.bashrc && chown -h vagrant:vagrant /home/vagrant/.bashrc

apt-get update

apt-get install -y default-jre
apt-get install -y default-jdk


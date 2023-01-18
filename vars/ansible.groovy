def ping(String pathOfKey, String hosts){
  sh "ansible ${hosts} -m ping --key-file ${pathOfKey}"
}

def playbook_execution(String pathOfKey, String playbook){
  //sh 'ansiblePlaybook credentialsId: 'tomcat credentials', disableHostKeyChecking: true, installation: 'ansible', inventory: ${inventory}, playbook: ${playbook}' 
}

def ansible_deploy_playbook(String inventory, String playbook){
  sh "ansible all -m ping"
  sh "ansible-playbook -i ${inventory} ${playbook} --user ansible1"
}

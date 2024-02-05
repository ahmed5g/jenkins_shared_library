def call (String gitUrl, String gitbranch){
    checkout([
        $class: 'GitSCM',
        branches: [[name: gitbranch]],
        userRemoteConfigs: [[url: gitUrl]]
    ])
}
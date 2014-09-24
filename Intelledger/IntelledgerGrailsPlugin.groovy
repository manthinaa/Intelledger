class IntelledgerGrailsPlugin {
    def version = '0.1'
    def grailsVersion = '2.1 > *'
    def loadAfter = [ 'hibernate' ]
    def title = 'Intelledger Plugin'
    def author = 'Anil Manthina'
    def authorEmail = 'anil.manthina@gmail.com'
    def description = 'Facilitates externalizing a Map into a Domain, so that an app can support both programmatic and administrative modification of variable data.'
    def documentation = 'http://grails.org/plugin/intelledger'
    def license = 'APACHE'
    def issueManagement = [system: 'GITHUB', url: 'https://github.com/manthinaa/Intelledger/issues']
    def scm = [url: 'https://github.com/manthinaa/Intelledger']
}

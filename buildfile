VERSION_NUMBER = "2.0.0"
GROUP = "codificando.com"
COPYRIGHT = "Emerson Macedo - codificando.com (c) 2010"

JBEHAVE2 = ['org.jbehave:jbehave-core:jar:2.5','org.hamcrest:hamcrest-all:jar:1.1']
JUNIT = 'junit:junit:jar:4.4'
COMMONS = ['commons-collections:commons-collections:jar:3.2','commons-lang:commons-lang:jar:2.3']

# Specify Maven 2.0 remote repositories here, like this:
repositories.remote << "http://www.ibiblio.org/maven2/"
repositories.remote << "http://mvnrepository.com/artifact/"
repositories.remote << "http://mirrors.ibiblio.org/pub/mirrors/maven2/"
repositories.remote << "http://repository.codehaus.org/"

desc "Projeto Jbehave-br. Patch de tradução para o Jbehave 2"
define "jbehave-br" do

  project.version = VERSION_NUMBER
  project.group = GROUP
  manifest["Implementation-Vendor"] = COPYRIGHT
  compile.options.target = '1.5'

  compile.with JBEHAVE2, JUNIT, COMMONS
  package :jar
end

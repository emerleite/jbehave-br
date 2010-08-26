jbehave-br
=======

Esse Projeto tem por objetivo permitir usar o Jbehave 2 com o idioma português do Brasil.
http://codificando.com/2009/04/jbehave-brasil-bdd-em-java-no-nosso-idioma/

Pre reqs
--------
* Java 1.5
* Jbehave 2.5

Instalação
----------

        Se você não sabe como instalar o google é seu amigo - http://www.google.com.br/search?q=instalando+ruby
        
        É necessário também o buildr para buildar o projeto - http://buildr.apache.org
         - sudo env JAVA_HOME=$JAVA_HOME gem install buildr
        
        Após instalar é só clonar o repositório e buildar o projeto:
        - git clone git://github.com/emerleite/jbehave-br.git
        - cd jbehave-br
        - buildr package
      
        Adicione o jar que será gerado em target/jbehave-br-VERSION.jar ao classpath da sua aplicação.

Utilização
----------

        Ao criar as especificações do Jbehave proceda da seguinte forma:
        - Arquivos texto com a extensão .feature - Ex: cadastro_valido.feature
        - Estender de PtBRScenario ao invés de Scenario.
        - Estebder de PtBRSteps ao invés de Steps.
        - Arquivo texto deve estar no mesmo pacote que a classe do Scenario.
        - No arquivo.feature utilizar as palavras Cenário, Dado, Quando, Então, E.
      
        Maiores detalhes basta os testes em src/test/java e src/test/resources.

Changelog
---------
* 2.0.0 - Suporte ao Jbehave 2.5
* 2.0.0 - Renomeado de .cenario para .feature
* 2.0.0 - Adicionado o arquivo de properties usando o I18nKeywords

To-Do
-----

* Add more tests for more keywords
* extend compatibility with jbehave 2.5.9
* Javadoc

Maintainer
----------

* Emerson Macedo (<http://codificando.com/>)

License:
--------

(The MIT License)

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
'Software'), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

# Course Manager

Sistema web para o controle do quadro de horário acadêmico do curso Engenharia de Software

## Tecnologias Utilizadas

- Java 11
- Spring / Spring Boot
- PostgreSQL
- HTML
- CSS
- JavaScript
- Bootstrap

## Telas

https://github.com/diogoribeiro1/course-manager/assets/89152312/55ee9fed-76cc-4196-b127-b4d2fbd1e6a4

![Screenshot from 2023-06-15 23-38-29](https://github.com/diogoribeiro1/course-manager/assets/89152312/27b7c6c9-23b6-4aba-b83f-4db60cdda602)
![Screenshot from 2023-06-15 23-38-35](https://github.com/diogoribeiro1/course-manager/assets/89152312/97fd7b45-2d51-447c-9f2b-63ef79feb0f8)
![Screenshot from 2023-06-15 23-38-41](https://github.com/diogoribeiro1/course-manager/assets/89152312/7a65ffac-a8fb-4a33-8543-f78f2b08cd12)
![Screenshot from 2023-06-15 23-38-45](https://github.com/diogoribeiro1/course-manager/assets/89152312/e4b43a96-a5a8-496c-adb2-a627a81fd460)
![Screenshot from 2023-06-15 23-38-50](https://github.com/diogoribeiro1/course-manager/assets/89152312/0f361065-b925-4f6f-abcd-87936b71e9e7)
![Screenshot from 2023-06-15 23-38-57](https://github.com/diogoribeiro1/course-manager/assets/89152312/ab730c4f-2780-4c1e-b9c2-ec35830cc110)
![Screenshot from 2023-06-15 23-39-02](https://github.com/diogoribeiro1/course-manager/assets/89152312/eba030d4-5416-49d5-9821-0de591c61b23)
![Screenshot from 2023-06-15 23-39-06](https://github.com/diogoribeiro1/course-manager/assets/89152312/77755b2a-1577-439e-9ac6-e4125747988f)

## Funcionalidades do Sistema

1) Cadastrar Estudante no curso (ID/Matrícula, nome completo, Email, Ano de egresso)

2) Cadastrar Professor no curso (ID/Matrícula, nome completo, Email, Ano de egresso)

3) Cadastrar Disciplina no curso (Código da disciplina, Nome,  Professor)

4) Matricular Estudantes na disciplina ( Código da disciplina, código do estudante)  

5) Emitir o Quadro de Horário do Professor   

6) Emitir o Quadro de Horário do Estudante

7) Emitir o  diário da disciplina  ( Imprimir o nome da disciplina, dia e horário da disciplina, professor e a lista de estudante matriculado)

## Configure e execute

1. Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema. Você pode verificar digitando java -version no terminal. Se não estiver instalado, você precisará instalá-lo.

2. Certifique-se de ter o Maven instalado em seu sistema. O Maven é uma ferramenta de automação de compilação e gerenciamento de dependências para projetos Java. Verifique digitando mvn -version no terminal. Se não estiver instalado, você precisará instalá-lo.

3. Abra o terminal e navegue até o diretório raiz do seu projeto Spring. O diretório raiz geralmente contém o arquivo pom.xml.

4. Execute o seguinte comando para compilar o projeto e empacotá-lo em um arquivo JAR:
```shell
   mvn clean package    
```
Isso irá compilar o código-fonte, executar os testes e gerar o arquivo JAR no diretório "target".

5. Depois que o pacote JAR for gerado com sucesso, você poderá executá-lo com o comando java -jar seguido do nome do arquivo JAR. Por exemplo:
```shell
   java -jar target/meuapp.jar    
```
Substitua "meuapp.jar" pelo nome real do seu arquivo JAR.

6. O aplicativo Spring será iniciado e começará a ser executado. Você verá as mensagens de log e, se tudo estiver configurado corretamente, poderá acessar o aplicativo em um navegador da web no endereço "http://localhost:8080" (ou outro endereço e porta, dependendo da configuração do seu aplicativo Spring).

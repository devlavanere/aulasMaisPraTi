<img style="width: 100%; height:200px" src="../../resource/img/imagem-java.jpg">

# Atividade 7 - Lista de Exercícios sobre Estruturas de Dados

Atividade que visa a prática das Estruturas de Dados, Lista Simples Encadeada, Lista Dupla Encadeada e Filas.

## Exercícios

### Lista Simplesmente Encadeada:

1. **Gerenciador de Tarefas:**  
   Implemente um gerenciador de tarefas onde cada tarefa é um nó em uma lista simplesmente encadeada. Permita que o usuário adicione, remova, e marque tarefas como concluídas.

2. **Histórico de Navegação:**  
   Crie uma aplicação que simule o histórico de navegação de um navegador utilizando uma lista simplesmente encadeada. Implemente funcionalidades para adicionar novas URLs e remover URLs antigas quando a lista atingir um certo tamanho.

3. **Controle de Reversão (Undo):**  
   Implemente um sistema de controle de reversão (undo) para uma aplicação de edição de texto. Use uma lista simplesmente encadeada para armazenar as ações realizadas e permita que o usuário desfaça as últimas ações.

### Lista Duplamente Encadeada:

4. **Editor de Texto:**  
   Implemente um editor de texto simples onde as operações de desfazer (undo) e refazer (redo) são gerenciadas por uma lista duplamente encadeada.

5. **Jogo de Cartas:**  
   Implemente um jogo simples de cartas onde a mão do jogador é representada por uma lista duplamente encadeada. Permita que o jogador adicione, remova, e reorganize as cartas na mão.

### Filas:

6. **Simulador de Fila de Atendimento em um Banco:**  
   Crie um simulador de fila de atendimento em um banco. Utilize uma fila para gerenciar os clientes que aguardam atendimento e implemente a lógica para chamar o próximo cliente.

7. **Gerenciamento de Impressões:**  
   Implemente um sistema de gerenciamento de impressões onde os trabalhos de impressão são enfileirados e processados na ordem em que chegam. Use uma fila para armazenar os trabalhos de impressão.

8. **Fila de Processos:**  
   Implemente uma fila que simula a fila de processos prontos para execução em um sistema operacional. Permita que novos processos sejam adicionados e que o processo mais antigo seja removido para execução.

---

## Como baixar e executar o projeto

### Clonar o repositório

1. Abra o terminal ou a linha de comando.
2. Execute o comando a seguir para clonar o repositório do GitHub para sua máquina local:

   ```bash
   git clone https://github.com/devlavanere/aulasMaisPraTi.git
3. Navegue até o repositório do projeto

   ```bash
   cd seu repositório

## Como Executar o Projeto Java em Vários Editores

### 1. IntelliJ IDEA
IntelliJ IDEA é um dos IDEs mais populares para desenvolvimento Java. Siga os passos abaixo para executar seu projeto:

#### Passos:
1. Abra o IntelliJ IDEA.
2. Vá até `File > Open` e selecione o diretório do projeto.
3. O IntelliJ vai importar automaticamente o projeto e as dependências.
4. Após a importação, localize o arquivo principal do projeto (por exemplo, `Main.java`).
5. Clique com o botão direito no arquivo e selecione `Run 'Main'` para executar o projeto.
6. O IntelliJ irá compilar e executar o código, e os resultados aparecerão na janela de terminal integrada.

---

### 2. Eclipse
Eclipse é outro editor amplamente utilizado para desenvolvimento Java. Veja como rodar o projeto nele:

#### Passos:
1. Abra o Eclipse e selecione um workspace.
2. Vá até `File > Import > Existing Projects into Workspace`.
3. Selecione o diretório do projeto e clique em `Finish`.
4. No painel de projetos, expanda o projeto e localize o arquivo `Main.java`.
5. Clique com o botão direito em `Main.java` e selecione `Run As > Java Application`.
6. O Eclipse irá compilar e executar o projeto. Os resultados aparecerão na janela de console.

---

### 3. NetBeans
NetBeans é outro IDE popular para desenvolvimento Java. Aqui estão as instruções para rodar o projeto:

#### Passos:
1. Abra o NetBeans.
2. Vá até `File > Open Project` e selecione o diretório do seu projeto Java.
3. O projeto será carregado no painel de projetos.
4. Encontre o arquivo principal do projeto (por exemplo, `Main.java`).
5. Clique com o botão direito no arquivo `Main.java` e selecione `Run File`.
6. O projeto será compilado e executado, e o resultado aparecerá na janela de saída.

---

### 4. VS Code com Extensão Java
O VS Code pode ser usado para desenvolvimento Java com a extensão "Extension Pack for Java". Siga os passos abaixo:

#### Passos:
1. Instale o **Visual Studio Code**.
2. Instale a extensão **Extension Pack for Java** da Microsoft (que inclui suporte para Maven e debugging).
3. Abra o VS Code e clique em `File > Open Folder` para abrir o diretório do projeto.
4. Se não tiver uma pasta `.vscode`, crie uma configuração de execução. Clique no ícone de execução à esquerda e escolha "Create a launch.json file".
5. Configure o projeto para rodar o arquivo `Main.java`.
6. Clique no ícone de execução (`Run`) no canto superior direito da tela para compilar e executar o projeto.
7. A saída será exibida no terminal integrado do VS Code.

---

### 5. Terminal (CLI)
Se preferir rodar o projeto diretamente pelo terminal sem usar um IDE completo, veja como proceder usando a CLI:

### Pré-requisitos:
- Ter o **JDK** instalado e configurado no **PATH**.

#### Passos:
1. Abra o terminal.
2. Navegue até o diretório onde o arquivo `Main.java` está localizado.

   ```bash
   cd caminho/para/o/projeto
3. Compile o arquivo Main.java usando o comando javac.
   
   ```bash
   javac Main.java
4. Após a compilação, execute o arquivo compilado com o comando java.

   ```bash
   java Main
5. O programa será executado no terminal e você verá a saída diretamente na linha de comando.

### Autor

[<img src="https://avatars.githubusercontent.com/u/125924854?s=400&u=505601333417c0f00a726bb3e1e757dcaa874463&v=4" width=115><br><sub>Michel L. Sampaio</sub>](https://github.com/devlavanere) 
  
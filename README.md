# huffmanTree 
Algorithms and Data Structure 1st Assigment - PUCRS
Authors: Lorenzo Bragagnolo, Rafael Dias.

A atividade consiste na construção em Java de um codificador e de um decodificador de texto que usa os Códigos de Huffman para tal. Além disso, é necessário o envio de um relatório.

O Codificador

Dado um arquivo de texto codificado com tamanho fixo código de acordo com o padrão ASCII, construa um programa que:
Conte a frequência de cada símbolo e guarde o resultado em um HashMap  charFrequency   HashMap<Character, Integer>
A partir dos dados de frequência, construa uma árvore de códigos de prefixo usando a codificação de Huffman.
Exporte o código de cada símbolo para um HashMap charHuffmanCode HashMap<Character, String>
Escreva o HashMap com os códigos em um arquivo texto.
Usando do HashMap com os códigos, converta o arquivo texto original em um arquivo codificado.

O Decodificador
Em um programa à parte, você deve reconstruir o arquivo texto original a partir do arquivo codificado e do HashMap com os códigos gerados a partir da árvore.

Compare os dois arquivos para determinar se os estes estão iguais.

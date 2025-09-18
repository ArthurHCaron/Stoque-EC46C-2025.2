# 1. Histórias de usuário

<p align="justify">A <i>Tabela 3</i> a seguir contém as histórias de usuário elicitadas.</p>

| ID   | História de usuário                                                                 | Critério de aceitação                                                                                                                                     | Prioridade | RF/RNF relacionado | Story points |
|:---- |:----------------------------------------------------------------------------------- |:--------------------------------------------------------------------------------------------------------------------------------------------------------- |:---------- |:------------------ |:------------ |
| US01 | Eu, como usuário regular, quero poder ter uma conta no sistema                      | Ao entrar no aplicativo, deve haver opção de cadastro ou login com conta existente                                                                        | Alta       | RF05 / RF06        | 13           |
| US02 | Eu, como usuário regular, quero poder registrar novos produtos no sistema | Após login, deve ser possível abrir janela para cadastro de novos produtos                                                                                | Alta       | RF01               | 13           |
| US03 | Como administrador ou conferista, quero ver uma lista do estoque                    | Itens devem ser listados com código, descrição, quantidade, localização e status em tabela separada                                                       | Alta       | RF02               | 13           |
| US04 | Como administrador ou conferista, quero registrar ajustes manuais de estoque        | Ajustes devem registrar data/hora, usuário, motivo e permitir anexo; todo ajuste deve gerar histórico consultável                                         | Média      | RF01 / RF03               | 3            |
| US05 | Como conferista, quero vincular nota fiscal à entrada de mercadoria                 | Deve permitir upload de XML ou cadastro manual; dados importados devem preencher produtos/quantidades; divergências devem ser sinalizadas                 | Média      | RF09               | 3            |
| US06 | Como administrador, quero emitir nota fiscal de saída                               | Sistema deve gerar nota conforme configurações fiscais, com possibilidade de emitir DANFE e enviar por e-mail                                            | Média      | RF08               | 3            |
| US07 | Como administrador ou conferista, quero criar solicitações de compra                | Sistema deve permitir solicitação com itens, quantidades e data prevista; status deve incluir Aberta, Enviada, Confirmada, Recebida, Cancelada            | Baixa      | RF07               | 3            |
| US08 | Como conferista, quero registrar chegada e conferência de mercadoria                | Conferência deve ser feita por código/lote; divergências devem ser sinalizadas; deve ser possível aceitar parcial, recusar itens e registrar justificativa | Média      | RF09               | 3            |
| US09 | Como administrador, quero visualizar indicadores em um dashboard                    | Painel deve exibir giro de estoque, itens críticos, valor total e últimas notas; indicadores devem atualizar automaticamente e permitir acesso detalhado   | Baixa      |     | 3            |




<div style="text-align: center">
<p>Tabela 3: Histórias de usuário</p>
</div>

<a href="../README.md">VOLTAR INÍCIO</a>

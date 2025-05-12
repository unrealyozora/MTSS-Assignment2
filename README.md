# MTSS-Assignment2
Repository per la seconda prova pratica del corso di MTSS 2025

[![Build status](https://github.com/unrealyozora/MTSS-Assignment2/actions/workflows/build%20and%20report.yml/badge.svg)](https://github.com/unrealyozora/MTSS-Assignment2/actions/workflows/build%20and%20report.yml)

[![Main Branch Coverage Status](https://coveralls.io/repos/github/unrealyozora/MTSS-Assignment2/badge.svg?branch=main)](https://coveralls.io/github/unrealyozora/MTSS-Assignment2?branch=main)

[![Develop Branch Coverage Status](https://coveralls.io/repos/github/unrealyozora/MTSS-Assignment2/badge.svg?branch=develop)](https://coveralls.io/github/unrealyozora/MTSS-Assignment2?branch=develop)

[![Checkstyle Status](https://img.shields.io/badge/code%20quality-checkstyle-brightgreen.svg)](https://unrealyozora.github.io/MTSS-Assignment2/checkstyle.html)

Abbiamo sviluppato il progetto seguendo le linee guida del Test Driven Development, per ogni nuovo set di feature abbiamo svilppato e rilasciato prima il rispettivo codice di test, e dopo il codice vero e proprio. Abbiamo cercato di mantenere le firme coerenti, seguendo gli standard di JUnit.

In questa prova abbiamo deciso di lascaire le configurazioni di default nel checkstyle (con dei commenti che rappresentano valori più consoni da usare). In questo modo possiamo dimostrare che in caso di errore, il controllo funzioni. Inizialmente se il chechstyle falliva, la build si fermava e i report che mostravano lo stato del checkstyle (e il report del code coverage) non venivano generati. Si vedeva solo che la build era fallita. Per ovviare al problema avevamo messo dei "continue-on-error: true" (nel file delle github action) così se anche si riscontravano errori, la build andava avanti, si generavano i report e venivano visualizzati. Questa soluzione però non è ottimale in quanto, qualunque fosse l'esito della build, veniva visualizzato sempre "success", quindi i badge della build mostravano sempre che tutto era andato bene, anche se non era così. Abbiamo quindi deciso di utilizzare una logica più complessa, modificando sempre il file .yml delle github action. Durante il processo di build, viene salvata una flag con lo stato ("passed" o "failed") della build. Se anche la build fallisce, grazie all' "if always()", i report vengono generati. Questa volta però, alla fine viene fatto il controllo sulla flag creata in precedenza. Questo permette di far fallire l'intero processo in caso di flag con stato "failed", ottenendo il badge corretto nel README e mostrando l'esatto esito della build.
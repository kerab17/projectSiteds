Feature: Realizar consulta en los registros de las autorizaciones de los asegurados

  Scenario: ConsultaAcreditacion

    Given encuentro en la web SITEDS
    When quiero consultar las acreditaciones
    Then se muestra una lista de las autorizaciones en fecha filtrada
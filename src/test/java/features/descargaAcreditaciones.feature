Feature: Descargar acreditaciones en excel

  Scenario: DescargaAcreditacion

    Given estoy en la web SITEDS
    When quiero descargar acreditaciones en excel
    Then se descarga las acreditaciones correctamente
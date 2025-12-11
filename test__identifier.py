import pytest
from identifier import Identifier

id = Identifier()

def test_identificador_vazio():
    assert id.validate_identifier("") is False

def test_primeiro_caractere_invalido():
    assert id.validate_identifier("1abc") is False

def test_identificador_valido_com_while():
    assert id.validate_identifier("a1b") is True

def test_caractere_invalido_no_meio():
    assert id.validate_identifier("a#b") is False

def test_identificador_longo():
    assert id.validate_identifier("abcdefg") is False

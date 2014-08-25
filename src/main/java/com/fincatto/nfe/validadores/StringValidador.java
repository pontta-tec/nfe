package com.fincatto.nfe.validadores;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringValidador {

    public static void mmaaaa(final String aamm) {
        try {
            new SimpleDateFormat("mm/yyyy").parse(aamm);
        } catch (final ParseException e) {
            throw new IllegalStateException("Formato invalido (mm/aaaa)");
        }
    }

    public static void aamm(final String aamm) {
        try {
            new SimpleDateFormat("yymm").parse(aamm);
        } catch (final ParseException e) {
            throw new IllegalStateException("Formato invalido (aamm)");
        }
    }

    public static void codigoDeBarras(final String codigoDeBarras) {
        final Matcher matcher = Pattern.compile("^([0-9]{0}|[0-9]{8}|[0-9]{12,14})$").matcher(codigoDeBarras);
        if (!matcher.find()) {
            throw new IllegalStateException("Codigo de barras com formato invalido");
        }
    }

    public static void telefone(final String telefone) {
        final Matcher matcher = Pattern.compile("^[0-9]{6,14}$").matcher(telefone);
        if (!matcher.find()) {
            throw new IllegalStateException("Telefone de tamanho invalido");
        }
    }

    public static void tamanho256(final String string) {
        StringValidador.validaTamanhoMaximo(string, 256);
    }

    public static void tamanho9(final String string) {
        StringValidador.validaTamanhoMaximo(string, 9);
    }

    public static void tamanho60(final String string) {
        StringValidador.validaTamanhoMaximo(string, 60);
    }

    public static void tamanho22(final String string) {
        StringValidador.validaTamanhoMaximo(string, 22);
    }

    public static void tamanho21(final String string) {
        StringValidador.validaTamanhoMaximo(string, 21);
    }

    public static void tamanho20(final String string) {
        StringValidador.validaTamanhoMaximo(string, 20);
    }

    public static void tamanho2000(final String string) {
        StringValidador.validaTamanhoMaximo(string, 2000);
    }

    public static void tamanho5000(final String string) {
        StringValidador.validaTamanhoMaximo(string, 5000);
    }

    public static void tamanho40(final String string) {
        StringValidador.validaTamanhoMaximo(string, 40);
    }

    public static void placaDeVeiculo(final String placaVeiculo) {
        final Matcher matcher = Pattern.compile("^([A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3})$").matcher(placaVeiculo);
        if (!matcher.find()) {
            throw new IllegalStateException("Nao esta no padrao");
        }
    }

    public static void cnpj(final String cnpj) {
        final Matcher matcher = Pattern.compile("^[0-9]{14}$").matcher(cnpj);
        if (!matcher.find()) {
            throw new IllegalStateException("Formato CNPJ Invalido");
        }
    }

    public static void cpf(final String cpf) {
        final Matcher matcher = Pattern.compile("^[0-9]{11}$").matcher(cpf);
        if (!matcher.find()) {
            throw new IllegalStateException("Formato CPF Invalido");
        }
    }

    public static void inscricaoEstadual(final String inscricaoEstadual) {
        final Matcher matcher = Pattern.compile("^(ISENTO|[0-9]{2,14}|)$").matcher(inscricaoEstadual);
        if (!matcher.find()) {
            throw new IllegalStateException("Inscricao estadual invalido");
        }
    }

    public static void inscricaoEstadualSemIsencao(final String inscricaoEstadual) {
        final Matcher matcher = Pattern.compile("^([0-9]{2,14}|)$").matcher(inscricaoEstadual);
        if (!matcher.find()) {
            throw new IllegalStateException("Inscricao estadual invalido");
        }
    }

    public static void exatamente3(final String string) {
        StringValidador.validaTamanhoExato(string, 3);
    }

    public static void exatamente5(final String string) {
        StringValidador.validaTamanhoExato(string, 5);
    }

    public static void exatamente9(final String string) {
        StringValidador.validaTamanhoExato(string, 9);
    }

    public static void exatamente17(final String string) {
        StringValidador.validaTamanhoExato(string, 17);
    }

    public static void exatamente4(final String string) {
        StringValidador.validaTamanhoExato(string, 4);
    }

    public static void exatamente6(final String string) {
        StringValidador.validaTamanhoExato(string, 6);
    }

    public static void exatamente21(final String string) {
        StringValidador.validaTamanhoExato(string, 21);
    }

    public static void exatamente1(final String string) {
        StringValidador.validaTamanhoExato(string, 1);
    }

    public static void tamanho15(final String string) {
        StringValidador.validaTamanhoMaximo(string, 15);
    }

    public static void tamanho12(final String string) {
        StringValidador.validaTamanhoMaximo(string, 12);
    }

    public static void tamanho120(final String string) {
        StringValidador.validaTamanhoMaximo(string, 120);
    }

    public static void tamanho6(final String string) {
        StringValidador.validaTamanhoMaximo(string, 6);
    }

    public static void tamanho500(final String string) {
        StringValidador.validaTamanhoMaximo(string, 500);
    }

    public static void exatamente7(final String string) {
        StringValidador.validaTamanhoExato(string, 7);
    }

    public static void exatamente8(final String string) {
        StringValidador.validaTamanhoExato(string, 8);
    }

    public static void exatamente2(final String string) {
        StringValidador.validaTamanhoExato(string, 2);
    }

    public static void tamanho8a9(final String string) {
        StringValidador.intervalo(string, 8, 9);
    }

    public static void tamanho15a256(final String string) {
        StringValidador.intervalo(string, 15, 256);
    }

    public static void tamanho8a9N(final String string) {
        StringValidador.intervalo(string, 8, 9);
        StringValidador.apenasNumerico(string);
    }

    public static void exatamente44(final String string) {
        StringValidador.validaTamanhoExato(string, 44);
    }

    public static void exatamente7N(final String string) {
        StringValidador.apenasNumerico(string);
        StringValidador.exatamente7(string);
    }

    public static void exatamente44N(final String string) {
        StringValidador.apenasNumerico(string);
        StringValidador.exatamente44(string);
    }

    public static void exatamente4N(final String string) {
        StringValidador.apenasNumerico(string);
        StringValidador.exatamente4(string);
    }

    public static void exatamente6N(final String string) {
        StringValidador.apenasNumerico(string);
        StringValidador.exatamente6(string);
    }

    public static void ncm(final String ncm) {
        final Matcher matcher = Pattern.compile("^([0-9]{2}|[0][1-9][0-9]{6}|[1-9][0-9]{7})$").matcher(ncm);
        if (!matcher.find()) {
            throw new IllegalStateException("NCM fora do padrao");
        }
    }

    private static void apenasNumerico(final String string) {
        if (!StringUtils.isNumeric(string)) {
            throw new IllegalStateException("a string precisa ser numerica");
        }
    }

    private static void validaTamanhoMaximo(final String string, final int tamanho) {
        if (string.length() < 1 || string.length() > tamanho) {
            throw new IllegalStateException(MessageFormat.format("Este campo deve possuir entre 1-{0} caracteres", tamanho));
        }
    }

    private static void validaTamanhoExato(final String string, final int tamanho) {
        if (string.length() != tamanho) {
            throw new IllegalStateException(MessageFormat.format("Este campo deve possuir {0} caracteres", tamanho));
        }
    }

    private static void intervalo(final String string, final int inicio, final int fim) {
        if (string.length() < inicio || string.length() > fim) {
            throw new IllegalStateException("Este campo deve possuir entre 8-9 caracteres");
        }
    }
}
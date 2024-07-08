package br.com.alura.screenmatch.Services;

public interface IConverteDados {
  <T> T  obterDados(String json, Class<T> classe);
}

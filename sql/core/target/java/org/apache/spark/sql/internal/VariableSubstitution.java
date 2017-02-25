package org.apache.spark.sql.internal;
/**
 * A helper class that enables substitution using syntax like
 * <code>${var}</code>, <code>${system:var}</code> and <code>${env:var}</code>.
 * <p>
 * Variable substitution is controlled by {@link SQLConf.variableSubstituteEnabled}.
 */
public  class VariableSubstitution {
  public   VariableSubstitution (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  private  java.util.regex.Pattern pattern ()  { throw new RuntimeException(); }
  /**
   * Given a query, does variable substitution and return the result.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substitute (java.lang.String input)  { throw new RuntimeException(); }
  /**
   * Given a variable, replaces with the substitute value (default to "").
   * @param variable (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String substituteVariable (java.lang.String variable)  { throw new RuntimeException(); }
}

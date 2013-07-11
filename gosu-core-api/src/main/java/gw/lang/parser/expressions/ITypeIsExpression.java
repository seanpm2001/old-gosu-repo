/*
 * Copyright 2013 Guidewire Software, Inc.
 */

package gw.lang.parser.expressions;

import gw.lang.parser.IExpression;

public interface ITypeIsExpression extends IExpression
{
  IExpression getLHS();

  ITypeLiteralExpression getRHS();
}

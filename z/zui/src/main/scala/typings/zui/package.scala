package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object zui {
  
  type ActionFunc = js.Function0[scala.Boolean]
  
  type CallBack = js.Function0[scala.Unit]
  
  type OnActionFunc = js.Function3[
    /* name */ java.lang.String, 
    /* action */ java.lang.String, 
    /* messager */ typings.zui.Messager, 
    js.Any
  ]
}

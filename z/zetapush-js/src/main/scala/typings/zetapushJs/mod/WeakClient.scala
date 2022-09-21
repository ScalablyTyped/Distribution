package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "WeakClient")
@js.native
open class WeakClient protected () extends Client {
  def this(options: WeakClientOptions) = this()
  
  def getToken(): Token = js.native
}

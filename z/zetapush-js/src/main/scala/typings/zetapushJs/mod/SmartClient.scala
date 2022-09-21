package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "SmartClient")
@js.native
open class SmartClient protected () extends Client {
  def this(options: SmartClientOptions) = this()
  
  def getCredentials(): Any = js.native
  
  def getSession(): Any = js.native
  
  def hasCredentials(): Boolean = js.native
  
  def isStronglyAuthenticated(): Boolean = js.native
  def isStronglyAuthenticated(session: Any): Boolean = js.native
  
  def isWeaklyAuthenticated(): Boolean = js.native
  def isWeaklyAuthenticated(session: Any): Boolean = js.native
  
  def setCredentials(credentials: Any): Unit = js.native
}

package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "SmartClient")
@js.native
class SmartClient protected () extends Client {
  def this(options: SmartClientOptions) = this()
  
  def getCredentials(): js.Any = js.native
  
  def getSession(): js.Any = js.native
  
  def hasCredentials(): Boolean = js.native
  
  def isStronglyAuthenticated(): Boolean = js.native
  def isStronglyAuthenticated(session: js.Any): Boolean = js.native
  
  def isWeaklyAuthenticated(): Boolean = js.native
  def isWeaklyAuthenticated(session: js.Any): Boolean = js.native
  
  def setCredentials(credentials: js.Any): Unit = js.native
}

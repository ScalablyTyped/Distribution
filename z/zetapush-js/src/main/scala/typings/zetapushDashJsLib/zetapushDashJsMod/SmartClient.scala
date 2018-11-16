package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zetapush-js", "SmartClient")
@js.native
class SmartClient protected () extends Client {
  def this(options: SmartClientOptions) = this()
  def getCredentials(): js.Any = js.native
  def getSession(): js.Any = js.native
  def hasCredentials(): scala.Boolean = js.native
  def isStronglyAuthenticated(): scala.Boolean = js.native
  def isStronglyAuthenticated(session: js.Any): scala.Boolean = js.native
  def isWeaklyAuthenticated(): scala.Boolean = js.native
  def isWeaklyAuthenticated(session: js.Any): scala.Boolean = js.native
  def setCredentials(credentials: js.Any): scala.Unit = js.native
}


package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zetapush-js", "Client")
@js.native
class Client protected () extends js.Object {
  def this(options: ClientOptions) = this()
  var helper: ClientHelper = js.native
  def addConnectionStatusListener(listener: ConnectionStatusListener): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def connect(): scala.Unit = js.native
  def createAsyncMacroService(declaration: ServiceDeclaration): zetapushDashJsLib.zetapushDashJsMod.servicesNs.Macro = js.native
  def createService(declaration: ServiceDeclaration): Service = js.native
  def disconnect(): scala.Unit = js.native
  def getResource(): java.lang.String = js.native
  def getSandboxId(): java.lang.String = js.native
  def getUserId(): java.lang.String = js.native
  def isConnected(): scala.Boolean = js.native
  //
  def onConnectionBroken(handler: js.Function0[scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onConnectionClosed(handler: js.Function0[scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onConnectionEstablished(handler: js.Function0[scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onConnectionToServerFail(handler: js.Function1[/* failure */ js.Any, scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onConnectionWillClose(handler: js.Function0[scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onFailedHandshake(handler: js.Function1[/* failure */ js.Any, scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onMessageLost(handler: js.Function0[scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onNegotiationFailed(handler: js.Function1[/* failure */ js.Any, scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onNoServerUrlAvailable(handler: js.Function0[scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def onSuccessfulHandshake(handler: js.Function1[/* authentication */ js.Any, scala.Unit]): zetapushDashJsLib.ConnectionStatusHandler = js.native
  def removeConnectionStatusListener(listener: zetapushDashJsLib.ConnectionStatusHandler): scala.Unit = js.native
  def setAuthentication(authentication: AuthenticationCallback): scala.Unit = js.native
  def setLogLevel(level: java.lang.String): scala.Unit = js.native
  def setResource(resource: java.lang.String): scala.Unit = js.native
  def unsubscribe(service: Service): scala.Unit = js.native
}


package typings.zetapushDashJs.zetapushDashJsMod

import typings.zetapushDashJs.ConnectionStatusHandler
import typings.zetapushDashJs.zetapushDashJsMod.servicesNs.Macro
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zetapush-js", "Client")
@js.native
class Client protected () extends js.Object {
  def this(options: ClientOptions) = this()
  var helper: ClientHelper = js.native
  def addConnectionStatusListener(listener: ConnectionStatusListener): ConnectionStatusHandler = js.native
  def connect(): Unit = js.native
  def createAsyncMacroService(declaration: ServiceDeclaration): Macro = js.native
  def createService(declaration: ServiceDeclaration): Service = js.native
  def disconnect(): Unit = js.native
  def getResource(): String = js.native
  def getSandboxId(): String = js.native
  def getUserId(): String = js.native
  def isConnected(): Boolean = js.native
  //
  def onConnectionBroken(handler: js.Function0[Unit]): ConnectionStatusHandler = js.native
  def onConnectionClosed(handler: js.Function0[Unit]): ConnectionStatusHandler = js.native
  def onConnectionEstablished(handler: js.Function0[Unit]): ConnectionStatusHandler = js.native
  def onConnectionToServerFail(handler: js.Function1[/* failure */ js.Any, Unit]): ConnectionStatusHandler = js.native
  def onConnectionWillClose(handler: js.Function0[Unit]): ConnectionStatusHandler = js.native
  def onFailedHandshake(handler: js.Function1[/* failure */ js.Any, Unit]): ConnectionStatusHandler = js.native
  def onMessageLost(handler: js.Function0[Unit]): ConnectionStatusHandler = js.native
  def onNegotiationFailed(handler: js.Function1[/* failure */ js.Any, Unit]): ConnectionStatusHandler = js.native
  def onNoServerUrlAvailable(handler: js.Function0[Unit]): ConnectionStatusHandler = js.native
  def onSuccessfulHandshake(handler: js.Function1[/* authentication */ js.Any, Unit]): ConnectionStatusHandler = js.native
  def removeConnectionStatusListener(listener: ConnectionStatusHandler): Unit = js.native
  def setAuthentication(authentication: AuthenticationCallback): Unit = js.native
  def setLogLevel(level: String): Unit = js.native
  def setResource(resource: String): Unit = js.native
  def unsubscribe(service: Service): Unit = js.native
}


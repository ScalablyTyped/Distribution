package typings.zetapushDashJs.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStatusListener extends js.Object {
  def onConnectionBroken(): Unit
  def onConnectionClosed(): Unit
  def onConnectionEstablished(): Unit
  def onConnectionToServerFail(failure: js.Any): Unit
  def onConnectionWillClose(): Unit
  def onFailedHandshake(failure: js.Any): Unit
  def onMessageLost(): Unit
  def onNegotiationFailed(failure: js.Any): Unit
  def onNoServerUrlAvailable(): Unit
  def onSuccessfulHandshake(authentication: js.Any): Unit
}

object ConnectionStatusListener {
  @scala.inline
  def apply(
    onConnectionBroken: () => Unit,
    onConnectionClosed: () => Unit,
    onConnectionEstablished: () => Unit,
    onConnectionToServerFail: js.Any => Unit,
    onConnectionWillClose: () => Unit,
    onFailedHandshake: js.Any => Unit,
    onMessageLost: () => Unit,
    onNegotiationFailed: js.Any => Unit,
    onNoServerUrlAvailable: () => Unit,
    onSuccessfulHandshake: js.Any => Unit
  ): ConnectionStatusListener = {
    val __obj = js.Dynamic.literal(onConnectionBroken = js.Any.fromFunction0(onConnectionBroken), onConnectionClosed = js.Any.fromFunction0(onConnectionClosed), onConnectionEstablished = js.Any.fromFunction0(onConnectionEstablished), onConnectionToServerFail = js.Any.fromFunction1(onConnectionToServerFail), onConnectionWillClose = js.Any.fromFunction0(onConnectionWillClose), onFailedHandshake = js.Any.fromFunction1(onFailedHandshake), onMessageLost = js.Any.fromFunction0(onMessageLost), onNegotiationFailed = js.Any.fromFunction1(onNegotiationFailed), onNoServerUrlAvailable = js.Any.fromFunction0(onNoServerUrlAvailable), onSuccessfulHandshake = js.Any.fromFunction1(onSuccessfulHandshake))
  
    __obj.asInstanceOf[ConnectionStatusListener]
  }
}


package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStatusListener extends js.Object {
  def onConnectionBroken(): scala.Unit
  def onConnectionClosed(): scala.Unit
  def onConnectionEstablished(): scala.Unit
  def onConnectionToServerFail(failure: js.Any): scala.Unit
  def onConnectionWillClose(): scala.Unit
  def onFailedHandshake(failure: js.Any): scala.Unit
  def onMessageLost(): scala.Unit
  def onNegotiationFailed(failure: js.Any): scala.Unit
  def onNoServerUrlAvailable(): scala.Unit
  def onSuccessfulHandshake(authentication: js.Any): scala.Unit
}

object ConnectionStatusListener {
  @scala.inline
  def apply(
    onConnectionBroken: () => scala.Unit,
    onConnectionClosed: () => scala.Unit,
    onConnectionEstablished: () => scala.Unit,
    onConnectionToServerFail: js.Any => scala.Unit,
    onConnectionWillClose: () => scala.Unit,
    onFailedHandshake: js.Any => scala.Unit,
    onMessageLost: () => scala.Unit,
    onNegotiationFailed: js.Any => scala.Unit,
    onNoServerUrlAvailable: () => scala.Unit,
    onSuccessfulHandshake: js.Any => scala.Unit
  ): ConnectionStatusListener = {
    val __obj = js.Dynamic.literal(onConnectionBroken = js.Any.fromFunction0(onConnectionBroken), onConnectionClosed = js.Any.fromFunction0(onConnectionClosed), onConnectionEstablished = js.Any.fromFunction0(onConnectionEstablished), onConnectionToServerFail = js.Any.fromFunction1(onConnectionToServerFail), onConnectionWillClose = js.Any.fromFunction0(onConnectionWillClose), onFailedHandshake = js.Any.fromFunction1(onFailedHandshake), onMessageLost = js.Any.fromFunction0(onMessageLost), onNegotiationFailed = js.Any.fromFunction1(onNegotiationFailed), onNoServerUrlAvailable = js.Any.fromFunction0(onNoServerUrlAvailable), onSuccessfulHandshake = js.Any.fromFunction1(onSuccessfulHandshake))
  
    __obj.asInstanceOf[ConnectionStatusListener]
  }
}


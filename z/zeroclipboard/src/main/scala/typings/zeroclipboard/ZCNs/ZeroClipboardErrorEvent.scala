package typings.zeroclipboard.ZCNs

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardErrorEvent extends ZeroClipboardEvent {
  var actualValue: js.UndefOr[String] = js.undefined
  var configuredValue: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[Dictionary[String]] = js.undefined
  var errors: js.UndefOr[js.Array[_]] = js.undefined
  var jsVersion: js.UndefOr[String] = js.undefined
  var message: String
  var minimumVersion: js.UndefOr[String] = js.undefined
  var name: String
  var property: js.UndefOr[String] = js.undefined
  var swfVersion: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ZeroClipboardErrorEvent {
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    message: String,
    name: String,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    actualValue: String = null,
    client: ZeroClipboardClient = null,
    configuredValue: String = null,
    data: Dictionary[String] = null,
    errors: js.Array[_] = null,
    jsVersion: String = null,
    minimumVersion: String = null,
    property: String = null,
    swfVersion: String = null,
    version: String = null
  ): ZeroClipboardErrorEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, message = message, name = name, relatedTarget = relatedTarget, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (actualValue != null) __obj.updateDynamic("actualValue")(actualValue)
    if (client != null) __obj.updateDynamic("client")(client)
    if (configuredValue != null) __obj.updateDynamic("configuredValue")(configuredValue)
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (jsVersion != null) __obj.updateDynamic("jsVersion")(jsVersion)
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion)
    if (property != null) __obj.updateDynamic("property")(property)
    if (swfVersion != null) __obj.updateDynamic("swfVersion")(swfVersion)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ZeroClipboardErrorEvent]
  }
}


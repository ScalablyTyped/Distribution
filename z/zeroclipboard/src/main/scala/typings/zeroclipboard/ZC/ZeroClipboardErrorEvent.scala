package typings.zeroclipboard.ZC

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
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actualValue != null) __obj.updateDynamic("actualValue")(actualValue.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (configuredValue != null) __obj.updateDynamic("configuredValue")(configuredValue.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (jsVersion != null) __obj.updateDynamic("jsVersion")(jsVersion.asInstanceOf[js.Any])
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (swfVersion != null) __obj.updateDynamic("swfVersion")(swfVersion.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardErrorEvent]
  }
}


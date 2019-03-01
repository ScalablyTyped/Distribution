package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardErrorEvent extends ZeroClipboardEvent {
  var actualValue: js.UndefOr[java.lang.String] = js.undefined
  var configuredValue: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[Dictionary[java.lang.String]] = js.undefined
  var errors: js.UndefOr[js.Array[_]] = js.undefined
  var jsVersion: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var minimumVersion: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var property: js.UndefOr[java.lang.String] = js.undefined
  var swfVersion: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ZeroClipboardErrorEvent {
  @scala.inline
  def apply(
    currentTarget: stdLib.HTMLObjectElement,
    message: java.lang.String,
    name: java.lang.String,
    relatedTarget: stdLib.HTMLElement,
    target: stdLib.HTMLElement,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    actualValue: java.lang.String = null,
    client: ZeroClipboardClient = null,
    configuredValue: java.lang.String = null,
    data: Dictionary[java.lang.String] = null,
    errors: js.Array[_] = null,
    jsVersion: java.lang.String = null,
    minimumVersion: java.lang.String = null,
    property: java.lang.String = null,
    swfVersion: java.lang.String = null,
    version: java.lang.String = null
  ): ZeroClipboardErrorEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
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


package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardConfig extends js.Object {
  /**
    * The class used to indicate that a clipped element is active (is being clicked).
    * @type {string}
    */
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Setting this to `false` would allow users to handle calling `ZeroClipboard.focus(...);`
    * themselves instead of relying on our per-element `mouseover` handler.
    * @type {boolean}
    */
  var autoActivate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Bubble synthetic events in JavaScript after they are received by the Flash object.
    * @type {boolean}
    */
  var bubbleEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include a "noCache" query parameter on requests for the SWF.
    * @type {boolean}
    */
  var cacheBust: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the class of the `div` encapsulating the Flash object.
    * @type {string}
    */
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the ID of the `div` encapsulating the Flash object.
    * Value is validated against the [HTML4 spec for `ID` tokens][valid_ids].
    * @type {string}
    */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ensure OS-compliant line endings, i.e. "\r\n" on Windows, "\n" elsewhere
    * @type {boolean}
    */
  var fixLineEndings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How many milliseconds to wait for the Flash SWF to load and respond before assuming that
    * Flash is deactivated (e.g. click-to-play) in the user's browser. If you don't care about
    * how long it takes to load the SWF, you can set this to `null`.
    * @type {number}
    */
  var flashLoadTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable use of the fancy "Desktop" clipboard, even on Linux where it is known to suck.
    * @type {boolean}
    */
  var forceEnhancedClipboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Forcibly set the hand cursor ("pointer") for all clipped elements.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {boolean}
    */
  var forceHandCursor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The class used to indicate that a clipped element is being hovered over.
    * @type {string}
    */
  var hoverClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the ID and name of the Flash `object` element.
    * Value is validated against the [HTML4 spec for `ID` and `Name` tokens][valid_ids].
    * @type {string}
    */
  var swfObjectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * SWF URL, relative to the page. Default value will be "ZeroClipboard.swf" under the same path as the ZeroClipboard JS file.
    * @type {string}
    */
  var swfPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the title of the `div` encapsulating the Flash object.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {string}
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * SWF inbound scripting policy: page domains that the SWF should trust. (single string, or array of strings)
    * @type {SingleOrList<string>}
    */
  var trustedDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The z-index used by the Flash object.
    * Max value (32-bit): 2147483647.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {number}
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object ZeroClipboardConfig {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    autoActivate: js.UndefOr[scala.Boolean] = js.undefined,
    bubbleEvents: js.UndefOr[scala.Boolean] = js.undefined,
    cacheBust: js.UndefOr[scala.Boolean] = js.undefined,
    containerClass: java.lang.String = null,
    containerId: java.lang.String = null,
    fixLineEndings: js.UndefOr[scala.Boolean] = js.undefined,
    flashLoadTimeout: scala.Int | scala.Double = null,
    forceEnhancedClipboard: js.UndefOr[scala.Boolean] = js.undefined,
    forceHandCursor: js.UndefOr[scala.Boolean] = js.undefined,
    hoverClass: java.lang.String = null,
    swfObjectId: java.lang.String = null,
    swfPath: java.lang.String = null,
    title: java.lang.String = null,
    trustedDomains: js.Array[java.lang.String] = null,
    zIndex: scala.Int | scala.Double = null
  ): ZeroClipboardConfig = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (!js.isUndefined(autoActivate)) __obj.updateDynamic("autoActivate")(autoActivate)
    if (!js.isUndefined(bubbleEvents)) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (!js.isUndefined(cacheBust)) __obj.updateDynamic("cacheBust")(cacheBust)
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (!js.isUndefined(fixLineEndings)) __obj.updateDynamic("fixLineEndings")(fixLineEndings)
    if (flashLoadTimeout != null) __obj.updateDynamic("flashLoadTimeout")(flashLoadTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEnhancedClipboard)) __obj.updateDynamic("forceEnhancedClipboard")(forceEnhancedClipboard)
    if (!js.isUndefined(forceHandCursor)) __obj.updateDynamic("forceHandCursor")(forceHandCursor)
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass)
    if (swfObjectId != null) __obj.updateDynamic("swfObjectId")(swfObjectId)
    if (swfPath != null) __obj.updateDynamic("swfPath")(swfPath)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trustedDomains != null) __obj.updateDynamic("trustedDomains")(trustedDomains)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardConfig]
  }
}


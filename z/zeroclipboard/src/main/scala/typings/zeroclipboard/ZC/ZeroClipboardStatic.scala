package typings.zeroclipboard.ZC

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Element
import typings.std.HTMLElement
import typings.zeroclipboard.zeroclipboardStrings.activeClass
import typings.zeroclipboard.zeroclipboardStrings.autoActivate
import typings.zeroclipboard.zeroclipboardStrings.bubbleEvents
import typings.zeroclipboard.zeroclipboardStrings.cacheBust
import typings.zeroclipboard.zeroclipboardStrings.containerClass
import typings.zeroclipboard.zeroclipboardStrings.containerId
import typings.zeroclipboard.zeroclipboardStrings.fixLineEndings
import typings.zeroclipboard.zeroclipboardStrings.flashLoadTimeout
import typings.zeroclipboard.zeroclipboardStrings.forceEnhancedClipboard
import typings.zeroclipboard.zeroclipboardStrings.forceHandCursor
import typings.zeroclipboard.zeroclipboardStrings.hoverClass
import typings.zeroclipboard.zeroclipboardStrings.swfObjectId
import typings.zeroclipboard.zeroclipboardStrings.swfPath
import typings.zeroclipboard.zeroclipboardStrings.title
import typings.zeroclipboard.zeroclipboardStrings.trustedDomains
import typings.zeroclipboard.zeroclipboardStrings.zIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardStatic
  extends ZeroClipboardCommon
     with Instantiable0[ZeroClipboardClient]
     with Instantiable1[(/* elements */ Element) | (/* elements */ List[Element]), ZeroClipboardClient] {
  /**
    * The version of the ZeroClipboard library being used, e.g. "2.0.0".
    * @type {string}
    */
  var version: String = js.native
  /**
    * Focus/"activate" the provided element by moving the Flash SWF object in front of it.
    * @param {Element} element
    * @deprecated: The preferred method to use is focus but the alias activate is available for backward compatibility's sake.
    */
  def activate(element: Element): Unit = js.native
  /**
    * Return the currently "activated" element that the Flash SWF object is in front of it.
    * @return {HTMLElement} or {null}
    */
  def activeElement(): HTMLElement = js.native
  /**
    * Blur/"deactivate" the currently focused/"activated" element, moving the Flash SWF object off the screen.
    * @since 2.1.0
    */
  def blur(): Unit = js.native
  /**
    * Get a copy of the active configuration for ZeroClipboard.
    * @return {ZeroClipboardConfig}
    */
  def config(): ZeroClipboardConfig = js.native
  /**
    * Set the active configuration for ZeroClipboard. Returns a copy of the updated active configuration.
    * @param  {ZeroClipboardConfig} config
    * @return {ZeroClipboardConfig}
    */
  def config(config: ZeroClipboardConfig): ZeroClipboardConfig = js.native
  /**
    *  Get a copy of the actively configured value for this configuration property for ZeroClipboard.
    * @param  {string} propName
    * @return {any}
    */
  def config(propName: String): js.Any = js.native
  @JSName("config")
  def config_activeClass(propName: activeClass): String = js.native
  @JSName("config")
  def config_autoActivate(propName: autoActivate): Boolean = js.native
  @JSName("config")
  def config_bubbleEvents(propName: bubbleEvents): Boolean = js.native
  @JSName("config")
  def config_cacheBust(propName: cacheBust): Boolean = js.native
  @JSName("config")
  def config_containerClass(propName: containerClass): String = js.native
  @JSName("config")
  def config_containerId(propName: containerId): String = js.native
  @JSName("config")
  def config_fixLineEndings(propName: fixLineEndings): Boolean = js.native
  @JSName("config")
  def config_flashLoadTimeout(propName: flashLoadTimeout): Double = js.native
  @JSName("config")
  def config_forceEnhancedClipboard(propName: forceEnhancedClipboard): Boolean = js.native
  @JSName("config")
  def config_forceHandCursor(propName: forceHandCursor): Boolean = js.native
  @JSName("config")
  def config_hoverClass(propName: hoverClass): String = js.native
  @JSName("config")
  def config_swfObjectId(propName: swfObjectId): String = js.native
  @JSName("config")
  def config_swfPath(propName: swfPath): String = js.native
  @JSName("config")
  def config_title(propName: title): String = js.native
  @JSName("config")
  def config_trustedDomains(propName: trustedDomains): js.Array[String] = js.native
  @JSName("config")
  def config_zIndex(propName: zIndex): Double = js.native
  /**
    * Create the Flash bridge SWF object.
    * IMPORTANT: This method should be considered private.
    * @private
    */
  def create(): Unit = js.native
  /**
    * Blur/"deactivate" the currently focused/"activated" element, moving the Flash SWF object off the screen.
    * @deprecated: The preferred method to use is blur but the alias deactivate is available for backward compatibility's sake.
    */
  def deactivate(): Unit = js.native
  /**
    * Emit the "destroy" event, remove all event handlers, and destroy the Flash bridge.
    */
  def destroy(): Unit = js.native
  /**
    * Focus/"activate" the provided element by moving the Flash SWF object in front of it.
    * @param {Element} element
    * @since 2.1.0
    */
  def focus(element: Element): Unit = js.native
  /**
    * Indicates if Flash Player is definitely unusable (disabled, outdated, unavailable, or deactivated).
    * IMPORTANT: This method should be considered private.
    * @return {boolean}
    * @private
    */
  def isFlashUnusable(): Boolean = js.native
  /**
    * Diagnostic method that describes the state of the browser, Flash Player, and ZeroClipboard.
    * @return {Object}
    */
  def state(): js.Object = js.native
}


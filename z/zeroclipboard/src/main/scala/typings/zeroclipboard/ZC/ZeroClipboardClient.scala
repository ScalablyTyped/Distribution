package typings.zeroclipboard.ZC

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardClient extends ZeroClipboardCommon {
  /**
    * A unique identifier for this ZeroClipboard client instance.
    * @type {string}
    */
  var id: String = js.native
  /**
    * Register clipboard actions for new element(s) to the client. This includes automatically invoking
    * ZeroClipboard.focus on the current element when it is hovered over, unless the autoActivate configuration
    * property is set to false.
    * @param  {Element[]} elements
    * @return {ZeroClipboardClient}
    */
  def clip(elements: List[Element]): ZeroClipboardClient = js.native
  /**
    * Register clipboard actions for new element(s) to the client. This includes automatically invoking
    * ZeroClipboard.focus on the current element when it is hovered over, unless the autoActivate configuration
    * property is set to false.
    * @param  {Element} element
    * @return {ZeroClipboardClient}
    */
  def clip(element: Element): ZeroClipboardClient = js.native
  /**
    * Remove all event handlers and unclip all clipped elements.
    */
  def destroy(): Unit = js.native
  /**
    * Get all of the elements to which this client is clipped/registered.
    * @return {HTMLElement[]}
    */
  def elements(): js.Array[HTMLElement] = js.native
  /**
    * Set the pending data of type "text/html" for clipboard injection.
    * @param {string} data
    */
  def setHtml(data: String): Unit = js.native
  /**
    * Set the pending data of type "application/rtf" for clipboard injection.
    * @param {string} data
    */
  def setRichText(data: String): Unit = js.native
  /**
    * Set the pending data of type "text/plain" for clipboard injection.
    * @param {string} data
    */
  def setText(data: String): Unit = js.native
  /**
    * Unregister the clipboard actions of previously registered element(s) on the page. If no elements are provided,
    * ALL clipped/registered elements will be unregistered.
    * @param  {Element} element
    * @return {ZeroClipboardClient}
    */
  def unclip(): ZeroClipboardClient = js.native
  def unclip(elements: Element): ZeroClipboardClient = js.native
  /**
    * Unregister the clipboard actions of previously registered element(s) on the page. If no elements are provided,
    * ALL clipped/registered elements will be unregistered.
    * @param  {Element[]} elements
    * @return {ZeroClipboardClient}
    */
  def unclip(elements: List[Element]): ZeroClipboardClient = js.native
}


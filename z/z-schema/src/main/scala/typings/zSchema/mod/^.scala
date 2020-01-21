package typings.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("z-schema", JSImport.Namespace)
@js.native
class ^ protected () extends Validator {
  def this(options: Options) = this()
}

@JSImport("z-schema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDefaultOptions(): Options = js.native
  /**
    * Get the list of all registered formats.
    *
    * Both the names of the burned-in formats and the custom format names are
    * returned by this function.
    *
    * @returns {string[]} the list of all registered format names.
    */
  def getRegisteredFormats(): js.Array[String] = js.native
  /**
    * Register a custom format.
    *
    * @param name - name of the custom format
    * @param validatorFunction - custom format validator function.
    *   Returns `true` if `value` matches the custom format.
    */
  def registerFormat(formatName: String, validatorFunction: js.Function1[/* value */ js.Any, Boolean]): Unit = js.native
  /**
    * Unregister a format.
    *
    * @param name - name of the custom format
    */
  def unregisterFormat(name: String): Unit = js.native
}


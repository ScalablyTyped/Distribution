package typings.zapierDashPlatformDashCore

import typings.node.Buffer
import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ContentType extends js.Object {
  def apply(input: String): String = js.native
  def apply(input: String, knownLength: Double): String = js.native
  def apply(input: String, knownLength: Double, filename: String): String = js.native
  def apply(input: String, knownLength: Double, filename: String, contentType: String): String = js.native
  def apply(input: js.Promise[String]): String = js.native
  def apply(input: Buffer): String = js.native
  def apply(input: Buffer, knownLength: Double): String = js.native
  def apply(input: Buffer, knownLength: Double, filename: String): String = js.native
  def apply(input: Buffer, knownLength: Double, filename: String, contentType: String): String = js.native
  def apply(input: ReadableStream[_]): String = js.native
  def apply(input: ReadableStream[_], knownLength: Double): String = js.native
  def apply(input: ReadableStream[_], knownLength: Double, filename: String): String = js.native
  def apply(input: ReadableStream[_], knownLength: Double, filename: String, contentType: String): String = js.native
}


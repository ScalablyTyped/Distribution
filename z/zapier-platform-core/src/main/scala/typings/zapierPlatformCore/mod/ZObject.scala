package typings.zapierPlatformCore.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Console
import typings.zapierPlatformCore.anon.Error
import typings.zapierPlatformCore.anon.Get
import typings.zapierPlatformCore.anon.HttpRequestOptionsrawtrue
import typings.zapierPlatformCore.anon.HttpRequestOptionsrawtrueAgent
import typings.zapierPlatformCore.anon.HttpRequestOptionsurlstri
import typings.zapierPlatformCore.anon.Parse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZObject extends js.Object {
  var JSON: Parse = js.native
  var console: Console = js.native
  var cursor: Get = js.native
  @JSName("dehydrateFile")
  var dehydrateFile_Original: DehydrateFunc = js.native
  @JSName("dehydrate")
  var dehydrate_Original: DehydrateFunc = js.native
  var errors: Error = js.native
  def dehydrate[T](func: js.Function2[/* z */ ZObject, /* bundle */ Bundle[T], _], inputData: js.Object): String = js.native
  def dehydrateFile[T](func: js.Function2[/* z */ ZObject, /* bundle */ Bundle[T], _], inputData: js.Object): String = js.native
  def generateCallbackUrl(): String = js.native
  /**
    * Easily hash data using node's crypto package
    * @param algorithm probably 'sha256', see [this](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options) for more options
    * @param data the data you want to hash
    * @param encoding defaults to 'hex'
    * @param input_encoding defaults to 'binary'
    */
  def hash(algorithm: String, data: String): String = js.native
  def hash(algorithm: String, data: String, encoding: js.UndefOr[scala.Nothing], input_encoding: String): String = js.native
  def hash(algorithm: String, data: String, encoding: String): String = js.native
  def hash(algorithm: String, data: String, encoding: String, input_encoding: String): String = js.native
  def request(options: HttpRequestOptionsrawtrueAgent): js.Promise[RawHttpResponse] = js.native
  def request(options: HttpRequestOptionsurlstri): js.Promise[HttpResponse] = js.native
  def request(url: String): js.Promise[HttpResponse] = js.native
  def request(url: String, options: HttpRequestOptionsrawtrue): js.Promise[RawHttpResponse] = js.native
  def request(url: String, options: HttpRequestOptions): js.Promise[HttpResponse] = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  def stashFile(input: String): String = js.native
  def stashFile(
    input: String,
    knownLength: js.UndefOr[scala.Nothing],
    filename: js.UndefOr[scala.Nothing],
    contentType: String
  ): String = js.native
  def stashFile(input: String, knownLength: js.UndefOr[scala.Nothing], filename: String): String = js.native
  def stashFile(input: String, knownLength: js.UndefOr[scala.Nothing], filename: String, contentType: String): String = js.native
  def stashFile(input: String, knownLength: Double): String = js.native
  def stashFile(input: String, knownLength: Double, filename: js.UndefOr[scala.Nothing], contentType: String): String = js.native
  def stashFile(input: String, knownLength: Double, filename: String): String = js.native
  def stashFile(input: String, knownLength: Double, filename: String, contentType: String): String = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  def stashFile(input: js.Promise[RawHttpResponse | String]): String = js.native
  def stashFile(input: Buffer): String = js.native
  def stashFile(
    input: Buffer,
    knownLength: js.UndefOr[scala.Nothing],
    filename: js.UndefOr[scala.Nothing],
    contentType: String
  ): String = js.native
  def stashFile(input: Buffer, knownLength: js.UndefOr[scala.Nothing], filename: String): String = js.native
  def stashFile(input: Buffer, knownLength: js.UndefOr[scala.Nothing], filename: String, contentType: String): String = js.native
  def stashFile(input: Buffer, knownLength: Double): String = js.native
  def stashFile(input: Buffer, knownLength: Double, filename: js.UndefOr[scala.Nothing], contentType: String): String = js.native
  def stashFile(input: Buffer, knownLength: Double, filename: String): String = js.native
  def stashFile(input: Buffer, knownLength: Double, filename: String, contentType: String): String = js.native
  def stashFile(input: ReadableStream): String = js.native
  def stashFile(
    input: ReadableStream,
    knownLength: js.UndefOr[scala.Nothing],
    filename: js.UndefOr[scala.Nothing],
    contentType: String
  ): String = js.native
  def stashFile(input: ReadableStream, knownLength: js.UndefOr[scala.Nothing], filename: String): String = js.native
  def stashFile(
    input: ReadableStream,
    knownLength: js.UndefOr[scala.Nothing],
    filename: String,
    contentType: String
  ): String = js.native
  def stashFile(input: ReadableStream, knownLength: Double): String = js.native
  def stashFile(
    input: ReadableStream,
    knownLength: Double,
    filename: js.UndefOr[scala.Nothing],
    contentType: String
  ): String = js.native
  def stashFile(input: ReadableStream, knownLength: Double, filename: String): String = js.native
  def stashFile(input: ReadableStream, knownLength: Double, filename: String, contentType: String): String = js.native
}


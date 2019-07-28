package typings.zmq.zmqMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zmq", "Socket")
@js.native
class Socket () extends EventEmitter {
  // Socket Options
  var _fd: js.Any = js.native
  var _ioevents: js.Any = js.native
  var _receiveMore: js.Any = js.native
  var _subscribe: js.Any = js.native
  var _unsubscribe: js.Any = js.native
  var affinity: js.Any = js.native
  var hwm: js.Any = js.native
  var identity: js.Any = js.native
  var last_endpoint: js.Any = js.native
  var linger: js.Any = js.native
  var mcast_loop: js.Any = js.native
  var rate: js.Any = js.native
  var rcvbuf: js.Any = js.native
  var reconnect_ivl: js.Any = js.native
  var recovery_ivl: js.Any = js.native
  var sndbuf: js.Any = js.native
  var swap: js.Any = js.native
  def backlog(): js.Any = js.native
  /**
    * Async bind.
    *
    * Emits the "bind" event.
    *
    * @param addr Socket address
    * @param cb Bind callback
    */
  def bind(addr: String): Socket = js.native
  def bind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket = js.native
  /**
    * Sync bind.
    *
    * @param addr Socket address
    */
  def bindSync(addr: String): Socket = js.native
  /**
    * Close the socket.
    *
    */
  def close(): Socket = js.native
  /**
    * Connect to `addr`.
    *
    * @param addr Connection address
    */
  def connect(addr: String): Socket = js.native
  /**
    * Disconnect from `addr`.
    *
    * @param addr The address
    */
  def disconnect(addr: String): Socket = js.native
  /**
    * Get socket `opt`.
    *
    * @param opt Option string
    */
  def getsocketopt(opt: String): js.Any = js.native
  /**
    * Get socket `opt`.
    *
    * @param opt Option number
    */
  def getsocketopt(opt: Double): js.Any = js.native
  /**
    * Enable monitoring of a Socket
    *
    * @param {Number} timer interval in ms > 0 or Undefined for default
    * @return {Socket} for chaining
    */
  def monitor(): Socket = js.native
  def monitor(interval: Double): Socket = js.native
  /**
    * Socket event
    * @param eventName {string}
    * @param callback {Function}
    */
  def on(eventName: String, callback: js.Function1[/* repeated */ Buffer, Unit]): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  /**
    * Send the given `msg`.
    *
    * @param msg The message
    * @param flags Message flags
    */
  def send(msg: String): Socket = js.native
  def send(msg: String, flags: Double): Socket = js.native
  /**
    * Send the given `msg`.
    *
    * @param msg The message
    * @param flags Message flags
    */
  def send(msg: js.Array[_]): Socket = js.native
  def send(msg: js.Array[_], flags: Double): Socket = js.native
  /**
    * Send the given `msg`.
    *
    * @param msg {Buffer} The message
    * @param flags {number} Optional message flags
    */
  def send(msg: Buffer): Socket = js.native
  def send(msg: Buffer, flags: Double): Socket = js.native
  /**
    * Set `opt` to `val`.
    *
    * @param opt Option
    * @param val Value
    */
  def setsocketopt(opt: String, `val`: js.Any): Socket = js.native
  /**
    * Set `opt` to `val`.
    *
    * @param opt Option
    * @param val Value
    */
  def setsocketopt(opt: Double, `val`: js.Any): Socket = js.native
  /**
    * Subscribe with the given `filter`.
    *
    * @param filter The filter
    */
  def subscribe(filter: String): Socket = js.native
  /**
    * Async unbind.
    *
    * Emits the "unbind" event.
    *
    * @param addr Socket address
    * @param cb Unind callback
    */
  def unbind(addr: String): Socket = js.native
  def unbind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket = js.native
  /**
    * Sync unbind.
    *
    * @param addr Socket address
    */
  def unbindSync(addr: String): Socket = js.native
  /**
    * Unsubscribe with the given `filter`.
    *
    * @param filter The filter
    */
  def unsubscribe(filter: String): Socket = js.native
}


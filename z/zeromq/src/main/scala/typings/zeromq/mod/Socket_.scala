package typings.zeromq.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeromq", "Socket")
@js.native
class Socket_ () extends EventEmitter {
  // Socket Options
  var _fd: js.Any = js.native
  var _ioevents: js.Any = js.native
  var _receiveMore: js.Any = js.native
  var _subscribe: js.Any = js.native
  var _unsubscribe: js.Any = js.native
  var affinity: js.Any = js.native
  var curve_publickey: String | Buffer = js.native
  var curve_secretkey: String | Buffer = js.native
  var curve_server: Double = js.native
  var curve_serverkey: String | Buffer = js.native
  var hwm: js.Any = js.native
  var identity: js.Any = js.native
  var last_endpoint: js.Any = js.native
  var linger: js.Any = js.native
  var mcast_loop: js.Any = js.native
  var mechanism: js.Any = js.native
  var plain_password: js.Any = js.native
  var plain_server: js.Any = js.native
  var plain_username: js.Any = js.native
  var rate: js.Any = js.native
  var rcvbuf: js.Any = js.native
  var reconnect_ivl: js.Any = js.native
  var recovery_ivl: js.Any = js.native
  var sndbuf: js.Any = js.native
  var swap: js.Any = js.native
  var zap_domain: js.Any = js.native
  def backlog(): js.Any = js.native
  /**
    * Async bind.
    *
    * Emits the "bind" event.
    *
    * @param addr Socket address
    * @param cb Bind callback
    */
  def bind(addr: String): Socket_ = js.native
  def bind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket_ = js.native
  /**
    * Sync bind.
    *
    * @param addr Socket address
    */
  def bindSync(addr: String): Socket_ = js.native
  /**
    * Close the socket.
    *
    */
  def close(): Socket_ = js.native
  /**
    * Connect to `addr`.
    *
    * @param addr Connection address
    */
  def connect(addr: String): Socket_ = js.native
  /**
    * Disconnect from `addr`.
    *
    * @param addr The address
    */
  def disconnect(addr: String): Socket_ = js.native
  def getsockopt(opt: String): js.Any = js.native
  /**
    * Get socket `opt`.
    *
    * @param opt Option number
    */
  def getsockopt(opt: Double): js.Any = js.native
  /**
    * Enable monitoring of a Socket. This enables the following additional events:
    * 'connect', 'connect_delay', 'connect_retry', 'listen', 'bind_error',
    * 'accept', 'accept_error', 'close', 'close_error', 'disconnect'.
    * Each event receives the parameters: (eventValue, eventEndpointAddrress, error)
    *
    * @param timer interval in ms > 0 or Undefined for default
    * @param numOfEvents The maximum number of events to read on each interval, default is 1, use 0 for reading all events
    * @return for chaining
    */
  def monitor(): Socket_ = js.native
  def monitor(interval: Double): Socket_ = js.native
  def monitor(interval: Double, numOfEvents: Double): Socket_ = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  /**
    * Send the given `msg`.
    *
    * @param msg The message
    * @param flags Message flags
    */
  def send(msg: String): Socket_ = js.native
  def send(msg: String, flags: Double): Socket_ = js.native
  def send(msg: js.Array[_]): Socket_ = js.native
  def send(msg: js.Array[_], flags: Double): Socket_ = js.native
  def send(msg: Buffer): Socket_ = js.native
  def send(msg: Buffer, flags: Double): Socket_ = js.native
  def setsockopt(opt: String, `val`: js.Any): Socket_ = js.native
  /**
    * Set `opt` to `val`.
    *
    * @param opt Option
    * @param val Value
    */
  def setsockopt(opt: Double, `val`: js.Any): Socket_ = js.native
  /**
    * Subscribe with the given `filter`.
    *
    * @param filter The filter
    */
  def subscribe(filter: String): Socket_ = js.native
  /**
    * Async unbind.
    *
    * Emits the "unbind" event.
    *
    * @param addr Socket address
    * @param cb Unind callback
    */
  def unbind(addr: String): Socket_ = js.native
  def unbind(addr: String, callback: js.Function1[/* error */ String, Unit]): Socket_ = js.native
  /**
    * Sync unbind.
    *
    * @param addr Socket address
    */
  def unbindSync(addr: String): Socket_ = js.native
  /**
    * Disable monitoring of a Socket release idle handler
    * and close the socket
    *
    * @return for chaining
    */
  def unmonitor(): Socket_ = js.native
  /**
    * Unsubscribe with the given `filter`.
    *
    * @param filter The filter
    */
  def unsubscribe(filter: String): Socket_ = js.native
}


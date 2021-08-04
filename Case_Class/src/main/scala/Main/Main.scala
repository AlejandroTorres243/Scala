package Main

import Class.{Email, Sms, VoiceRecording}
import Message.Mensaje

object Main extends App {
  val email = Email("gap12@gae.es","johnDoe@hotmail.com","Prueba de datos")
  val someSms = Sms("12345", "Are you there?")
  val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")
  val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
  val msj = new Mensaje()
  println(msj.showNotification(someSms).toString())
  println(msj.showNotification(email).toString())
  println(msj.showNotification(someVoiceRecording).toString())
  println(msj.showImportantNotification(someSms,importantPeopleInfo).toString())
  println(msj.showImportantNotification(email,importantPeopleInfo).toString())

}

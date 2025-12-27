import { useState } from "react";

function App() {
  const [userId, setUserId] = useState("U1");
  const [amount, setAmount] = useState(100);
  const [result, setResult] = useState("");
  const [balance, setBalance] = useState("");

  const fetchBalance = async () => {
    const res = await fetch(`http://localhost:8083/wallet/balance/${userId}`);
    const data = await res.text();
    setBalance(data);
  };

  const makePayment = async () => {
    try {
      const res = await fetch(
        `http://localhost:8083/payment/pay/${userId}/${amount}`,
        { method: "POST" }
      );
      const data = await res.text();
      setResult(data);
      fetchBalance();
    } catch (e) {
      setResult("SERVICE UNAVAILABLE");
    }
  };

  return (
    <div style={{ padding: "30px", fontFamily: "Arial" }}>
      <h2>💳 Payment & Wallet Dashboard</h2>

      <label>User ID:</label><br/>
      <input value={userId} onChange={e => setUserId(e.target.value)} /><br/><br/>

      <label>Amount:</label><br/>
      <input type="number" value={amount} onChange={e => setAmount(e.target.value)} /><br/><br/>

      <button onClick={makePayment}>Pay</button>
      <button onClick={fetchBalance} style={{ marginLeft: "10px" }}>
        Check Balance
      </button>

      <hr/>

      <p><b>Payment Result:</b> {result}</p>
      <p><b>Wallet Balance:</b> {balance}</p>
    </div>
  );
}

export default App;

import { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { getAuth, createUserWithEmailAndPassword } from 'firebase/auth';

const CreateAccountPage = () => {
   const [email, setEmail] = useState('');
   const [password, setPassword] = useState('');
   const [confirmPassword, setConfirmPassword] = useState('');
   const [error, setError] = useState('');

   const navigate = useNavigate();

   const createAccount = async () => {
      try {
         if (password !== confirmPassword) {
            setError('Passwords don not match');
            return;
         }
         await createUserWithEmailAndPassword(getAuth(), email, password);
         navigate('/articles');
      } catch (e) {
         setError(e.message);
      }
   }

   return (
      <>
         <h1>Create Account</h1>
         {error && <p className='error'>{error}</p>}
         <input 
            type="email"
            placeholder='Email'
            value={email}
            onChange={e => setEmail(e.target.value)} />
         <input 
            type="password" 
            placeholder='Password'
            value={password}
            onChange={e => setPassword(e.target.value)} />
         <input 
            type="password" 
            placeholder='Re-enter Password'
            value={confirmPassword}
            onChange={e => setConfirmPassword(e.target.value)} />
         <button onClick={createAccount}>Create Account</button>
         <Link to="/login">Already have an account? Login here</Link>
      </>
   )
   
}

export default CreateAccountPage;
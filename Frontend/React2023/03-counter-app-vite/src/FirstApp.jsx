import PropTypes from 'prop-types';

export const FirstApp = ({title, subtitle, name}) => {
   return (
      <>
         <h1 data-testid='test-title'>{title}</h1>
         <div>{subtitle}</div>
         <div>{subtitle}</div>
         <div>{name}</div>
      </>
   )
}

FirstApp.propTypes = {
   title: PropTypes.string.isRequired,
   subtitle: PropTypes.string.isRequired,
}

FirstApp.defaultProps = {
   subtitle: 'subtitle',
   name: 'name',
 };


